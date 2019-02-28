package typings
package broDashFsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object broDashFsLibStrings {
  @js.native
  sealed trait ArrayBuffer extends js.Object
  
  @js.native
  sealed trait BinaryString
    extends broDashFsLib.broDashFsMod.TextType
  
  @js.native
  sealed trait DataURL
    extends broDashFsLib.broDashFsMod.TextType
  
  @js.native
  sealed trait Text
    extends broDashFsLib.broDashFsMod.TextType
  
  @scala.inline
  def ArrayBuffer: ArrayBuffer = "ArrayBuffer".asInstanceOf[ArrayBuffer]
  @scala.inline
  def BinaryString: BinaryString = "BinaryString".asInstanceOf[BinaryString]
  @scala.inline
  def DataURL: DataURL = "DataURL".asInstanceOf[DataURL]
  @scala.inline
  def Text: Text = "Text".asInstanceOf[Text]
}

