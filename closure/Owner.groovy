class NestedClosure{
    void run(){
	def nestedClosure = {
	    // 'owner' refers to the parent closure, not the parent class like 'this'.
	    def collectOwner = { owner }	
	    collectOwner();
	}
	assert nestedClosure() == nestedClosure
    }
}

def closure = new NestedClosure();
closure.run();
