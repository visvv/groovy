class Person {
    String name;
    String age;
    String email;
    String toString() { "$name, $age, $email"}
    String dump(){
	def cl = {
	  // this refers to the parent object
	  println(this.toString());
	}
	cl();
    }
}

def person = new Person(name: "sam", age : 12, email : "sam@mail.com")
person.dump();

