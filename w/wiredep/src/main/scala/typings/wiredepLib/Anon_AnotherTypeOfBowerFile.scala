package typings
package wiredepLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AnotherTypeOfBowerFile extends js.Object {
  /**
    * <format for this {{filePath}} to be injected>
    */
  var typeOfBowerFile: java.lang.String
  /**
    * @exemple:
    *   return '<script class="random-' + Math.random() + '" src="' + filePath + '"></script>'
    */
  def anotherTypeOfBowerFile(filePath: java.lang.String): java.lang.String
}

object Anon_AnotherTypeOfBowerFile {
  @scala.inline
  def apply(anotherTypeOfBowerFile: java.lang.String => java.lang.String, typeOfBowerFile: java.lang.String): Anon_AnotherTypeOfBowerFile = {
    val __obj = js.Dynamic.literal(anotherTypeOfBowerFile = js.Any.fromFunction1(anotherTypeOfBowerFile), typeOfBowerFile = typeOfBowerFile)
  
    __obj.asInstanceOf[Anon_AnotherTypeOfBowerFile]
  }
}

