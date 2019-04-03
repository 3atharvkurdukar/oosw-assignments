#include <iostream>

using namespace std;

class Car
{

    string model, color;
    public:
    Car(string model, string color)
    {
        this->model = model;
        this->color = color;
        cout << color << " " << model << " created!" << endl;
    }
    ~Car()
    {
        cout << color << " " << model << " destroyed!" << endl;
    }
};

int main()
{
    Car c[5] = {
        Car("Indica", "White"),
        Car("Baleno", "Blue"),
        Car("Fortuner", "White"),
        Car("Scorpio", "Black"),
        Car("Swift", "Black")
    };
    return 0;
}
