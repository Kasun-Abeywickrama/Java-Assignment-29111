<h3>Question :</h3>
Create a super class called Car. The Car class has the following fields and methods.

int speed;
double regularPrice;
String color;
double getSalePrice();

Create a sub class of Car class and name it as Truck. The Truck class has the following fields and methods.

int weight;
◦double getSalePrice();//Ifweight>2000,10%discount.Otherwise,20%discount.
Create a subclass of Car class and name it as Ford. The Ford class has the following fields and methods

◦int year;
◦int manufacturerDiscount;
◦double
getSalePrice();//FromthesalepricecomputedfromCarclass,subtractthemanufacturerD
iscount.

Create a subclass of Car class and name it as Sedan. The Sedan class has the following fields and
methods.

◦int length;
◦double getSalePrice();//Iflength>20feet,5%discount,Otherwise,10%discount.

Create MyOwnAutoShop class which contains the main() method. Perform the following within the main() method 

Create an instance of Sedan class and initialize all the fields with appropriate values. Use super(...) method in the constructor for initializing the fields of the superclass. Create two instances of the Ford class and initialize all the fields with appropriate values. Use
super(...) method in the constructor for initializing the fields of the super class.Create an instance of Car class and initialize all the fields with appropriate values. Display the sale prices of all instance.
