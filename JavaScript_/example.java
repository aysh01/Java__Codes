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
x.display(); //Here, Display method is used once to display the array [2,10,3]

x.remove(); //Remove() function is used to pop the last element from the array.
x.display(); //display()


//We, can use Remove() function multiple times to pop the last element from the array.
// x.remove(); 
// x.display(); 


