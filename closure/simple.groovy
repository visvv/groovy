Closure getNumbers = {123}
println(getNumbers())


// closure with arguments.
def sayHi= { str ->  "Hi, $str"} // 
assert sayHi("Sachin") == "Hi, Sachin"
assert sayHi.call("Sachin") == "Hi, Sachin"
def hiMessage = sayHi "sachin"
println hiMessage

// implicit parameters
def sayHello = { "Hello ,$it"}
println sayHello("Sam")

// var args 

def join = { String... args -> args.join(', ') }

println(join("one", "two", "three"))






