fun main() {
val obj = BB()
    obj.test()
}

open class  AA(){
  open fun test() {
      print("aaaaaaaaaaaaaa")
  }
}

interface CC {
    open fun test() {
        print("cccccccccc")
    }
}

class  BB :AA() ,CC {
  override fun test() {
      print("1")
      super<AA>.test()
      print("2")
      super<CC>.test()
      print("3")

  }
}

