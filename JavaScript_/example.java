//Stack Implementation using Arrays in JS.
class example{
    constructor(){
        this.array = []; //Empty Array
    }

    //Method//
    append(a){
        this.array.push(a); //Push Operation
    }

    remove(){
        this.array.pop() //Pop Operation
    }

    display(){
        console.log(this.array);
    }
}

const x=new example();
x.append(2); //Appending values inside array
x.append(10); //Appending values inside array
x.append(3); //Appending values inside array

x.remove();
x.remove();
x.display(); //Display method is used to display the array

