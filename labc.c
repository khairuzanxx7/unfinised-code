#include <stdio.h>

void main ()
{ char name [200];
  int age;
  float salary;

  printf("name: ");
  scanf("%s", &name);
  printf("age: ");
  scanf("%d", &age);
  printf("salary: ");
  scanf("%f", &salary);

  printf("your name is %s, age %d with salary %3.2f.", name, age, salary);
}