class MessageFactory {
    def static factory
	def static getErrorMessage () { return factory.errorMessage }
    def static getWarningMessage() { return factory.warningMessage }
    def static getSuccessMessage() { return factory.successMessage }
}

def textMessageFactory = [ successMessage: "Finished successfully", errorMessage : "Finished with error", warningMessage: "Finished with warning/warnings" ]
MessageFactory.factory  = textMessageFactory;

