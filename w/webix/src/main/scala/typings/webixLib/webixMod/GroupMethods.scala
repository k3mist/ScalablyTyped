package typings
package webixLib.webixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupMethods extends js.Object {
  def any(property: java.lang.String, data: js.Any): scala.Unit
  def count(property: java.lang.String, data: js.Any): scala.Unit
  def max(property: java.lang.String, data: js.Any): scala.Unit
  def min(property: java.lang.String, data: js.Any): scala.Unit
  def string(property: java.lang.String, data: js.Any): scala.Unit
  def sum(property: java.lang.String, data: js.Any): scala.Unit
}

object GroupMethods {
  @scala.inline
  def apply(
    any: js.Function2[java.lang.String, js.Any, scala.Unit],
    count: js.Function2[java.lang.String, js.Any, scala.Unit],
    max: js.Function2[java.lang.String, js.Any, scala.Unit],
    min: js.Function2[java.lang.String, js.Any, scala.Unit],
    string: js.Function2[java.lang.String, js.Any, scala.Unit],
    sum: js.Function2[java.lang.String, js.Any, scala.Unit]
  ): GroupMethods = {
    val __obj = js.Dynamic.literal(any = any, count = count, max = max, min = min, string = string, sum = sum)
  
    __obj.asInstanceOf[GroupMethods]
  }
}

