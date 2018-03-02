// --------- Класс-Родитель ------------
// Конструктор родителя
function Car(name) {
    this.name = name;
    this.maxspeed = 100;
    this.rudder = true;
    this.gearbox = true;
}

// Методы хранятся в прототипе
Car.prototype.run = function() {
    alert(this.name + " набрала " + this.maxspeed + " км/ч.")
}

// --------- Класс-потомок -----------
// Конструктор потомка
function BMW(name) {
    Car.apply(this, arguments); //
}

// Наследование
BMW.prototype = Object.create(Car.prototype);
// Сохранение constructor
BMW.prototype.constructor = BMW;

// Методы потомка
BMW.prototype.run = function() {
    if (this.gearbox == true) {
        alert("Коробка передач унаследована.")
    }
    if (this.rudder == true) {
        alert("Руль унаследован.")
    }
    // Вызов метода родителя. Таким образом, мы расширяем метод потомка, делая метод родителя его частью.
    Car.prototype.run.apply(this);
    this.maxspeed = 200; //Сначала выводится скорость, изначально заданная в Car, после измененная нами для BMW.
    alert( this.name + " набрала " + this.maxspeed + " км/ч." );
};

// --------- Создаем Объект ------------
var bmw = new BMW('BMW');