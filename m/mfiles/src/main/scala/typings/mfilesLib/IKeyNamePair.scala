package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IKeyNamePair extends js.Object {
  val Key: scala.Double
  val Name: java.lang.String
  def Clone(): IKeyNamePair
}

object IKeyNamePair {
  @scala.inline
  def apply(Clone: js.Function0[IKeyNamePair], Key: scala.Double, Name: java.lang.String): IKeyNamePair = {
    val __obj = js.Dynamic.literal(Clone = Clone, Key = Key, Name = Name)
  
    __obj.asInstanceOf[IKeyNamePair]
  }
}

