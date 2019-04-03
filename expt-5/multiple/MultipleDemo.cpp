#include <iostream>

using namespace std;

class Terrestial
{
public:
  void display()
  {
    cout << "We live on land!" << endl;
  }
};

class Aquatic
{
public:
  void display()
  {
    cout << "We live in water!" << endl;
  }
};

class Amphibian : public Terrestial, public Aquatic
{
public:
  void display()
  {
    Terrestial::display();
    Aquatic::display();
    cout << "We are amphibians!" << endl;
  }
};

int main()
{
  Amphibian frog;
  frog.display();
  return 0;
}