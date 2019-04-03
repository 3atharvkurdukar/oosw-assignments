#include <iostream>

using namespace std;

class Animal
{
  public:
    void display()
    {
        cout << "We can move!" << endl;
    }
};

class Mammal: virtual public Animal
{
  public:
    void display()
    {
        cout << "We have mammary glands!" << endl;
    }
};

class Bird: virtual public Animal
{
  public:
    void display()
    {
        cout << "We can fly!" << endl;
    }
};

class Bat : public Mammal, public Bird
{
  public:
    void display()
    {
        Animal::display();
        Mammal::display();
        Bird::display();
        cout << "We are bats!" << endl;
    }
};

int main()
{
    Bat b;
    b.display();
    return 0;
}