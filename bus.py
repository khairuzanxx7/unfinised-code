import datetime
import time

class BookingSystem:
    def __init__(self):
        self.bookings = []
        self.request_time = {}

    def make_booking(self, name, num_guests, date):
        # Validate input
        if not name:
            raise ValueError('Name is required')
        if not isinstance(num_guests, int) or num_guests < 1:
            raise ValueError('Number of guests must be a positive integer')
        if not isinstance(date, str):
            raise ValueError('Date must be a string')

        try:
            # Parse the date string and check if it's a valid date
            datetime.datetime.strptime(date, '%Y-%m-%d')
        except ValueError:
            raise ValueError('Invalid date format. Date must be in YYYY-MM-DD format')

        # Check if the date is in the future
        if datetime.datetime.strptime(date, '%Y-%m-%d').date() < datetime.date.today():
            raise ValueError('Date must be in the future')

        # Check rate limit
        if name in self.request_time:
            elapsed_time = time.time() - self.request_time[name]
            if elapsed_time < 60:
                raise ValueError(f'Rate limit exceeded. Please try again in {60 - elapsed_time:.2f} seconds')

        # Update request time
        self.request_time[name] = time.time()

        # Create the booking
        booking = {
            'name': name,
            'num_guests': num_guests,
            'date': date
        }
        self.bookings.append(booking)

    def get_bookings(self):
        return self.bookings

    def get_bookings_for_date(self, date):
        if not isinstance(date, str):
            raise ValueError('Date must be a string')

        try:
            # Parse the date string and check if it's a valid date
            datetime.datetime.strptime(date, '%Y-%m-%d')
        except ValueError:
            raise ValueError('Invalid date format. Date must be in YYYY-MM-DD format')

        return [b for b in self.bookings if b['date'] == date]

    def get_booking(self, name):
        if not name:
            raise ValueError('Name is required')

        for booking in self.bookings:
            if booking['name'] == name:
                return booking
        return None

    def cancel_booking(self, name):
        if not name:
            raise ValueError('Name is required')

        booking = self.get_booking(name)
        if booking:
            self.bookings.remove(booking)
            return True
        return False

    def get_bookings_tomorrow(self):
        tomorrow = datetime.date.today() + datetime.timedelta(days=1)
        return self.get_bookings_for_date
