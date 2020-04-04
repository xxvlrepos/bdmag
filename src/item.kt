class item(_name: String) {
    var name: String
    var category: String = " "
    var price: Int = 0
    var describe: String = " "
    init {
        name = _name
    }
    constructor(_name: String, _category: String, _price: Int, _describe: String ) : this(_name){
        category = _category
        price = _price
        describe = _describe
    }
}
