package org.nicerobot.dynamic

class dy extends Dynamic {
  def applyDynamic(tag: String)(args: Any*):dy = {
    println(tag,args)
    this
  }
  implicit def s(e: String) = new dy() text(e)  
  implicit def u(e: Unit) = new dy()
  def +(args:Any*) = new dy
  def <(args:Any*) = new dy
  def >(args:Any*) = new dy
  def ~(args:Any*) = new dy
  def !(args:Any*) = new dy
  def \(args:Any*) = new dy
  def /(args:Any*) = new dy
  def ?(args:Any*) = new dy
  def |(args:Any*) = new dy
}
