class User {
   String name; 
}

class Player {
      String name ;
}

def loadName = { delegate.name.toUpperCase()}

def user = new User(name : "User name")
def player = new Player(name : "player name")

loadName.delegate = user
println loadName()
loadName.delegate = player
println loadName()

