package typings
package sparqljsLib.sparqljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeQuery
  extends Query
     with BaseQuery {
  var queryType: sparqljsLib.sparqljsLibStrings.DESCRIBE
  var variables: js.Array[Variable] | js.Array[sparqljsLib.sparqljsLibStrings.`*`]
}

