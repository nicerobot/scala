package org.nicerobot.dynamic

import java.io.File

class Path(name: String = "", parent: Option[Path] = None) extends Dynamic {
  def applyDynamic(methodName: String)(args: Any*) = new Path(methodName, Option(this))
  override def toString = (if(parent.isDefined) parent.get.toString + File.separatorChar else "") + name
}
