package typings
package tableLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object tableLibStrings {
  @js.native
  sealed trait center extends js.Object
  
  @js.native
  sealed trait honeywell
    extends tableLib.tableMod.BorderType
  
  @js.native
  sealed trait left extends js.Object
  
  @js.native
  sealed trait norc
    extends tableLib.tableMod.BorderType
  
  @js.native
  sealed trait ramac
    extends tableLib.tableMod.BorderType
  
  @js.native
  sealed trait right extends js.Object
  
  @js.native
  sealed trait void
    extends tableLib.tableMod.BorderType
  
  @scala.inline
  def center: center = "center".asInstanceOf[center]
  @scala.inline
  def honeywell: honeywell = "honeywell".asInstanceOf[honeywell]
  @scala.inline
  def left: left = "left".asInstanceOf[left]
  @scala.inline
  def norc: norc = "norc".asInstanceOf[norc]
  @scala.inline
  def ramac: ramac = "ramac".asInstanceOf[ramac]
  @scala.inline
  def right: right = "right".asInstanceOf[right]
  @scala.inline
  def void: void = "void".asInstanceOf[void]
}

