package org.nicerobot.dynamic

// http://stackoverflow.com/questions/5852833/scala-programatically-open-and-close-an-xml-tag-using-literal-syntax

import scala.xml.{TopScope, Elem, Text, Node}
import scala.xml.NodeSeq.Empty

object tag extends Dynamic {
  def applyDynamic(tag: String)(children: Any*) = {
    this
  }
  def /(args:Any*) = this
}
