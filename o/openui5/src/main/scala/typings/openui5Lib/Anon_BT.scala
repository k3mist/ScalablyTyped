package typings
package openui5Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BT extends js.Object {
  /**
    * FilterOperator between.When used on strings, the BT operator might not behave intuitively. For
    * example,when filtering a list of Names with BT "A", "B", all Names starting with "A" will beincluded
    * as well as the name "B" itself, but no other name starting with "B".
    */
  var BT: js.Any
  /**
    * FilterOperator contains
    */
  var Contains: js.Any
  /**
    * FilterOperator equals
    */
  var EQ: js.Any
  /**
    * FilterOperator ends with
    */
  var EndsWith: js.Any
  /**
    * FilterOperator greater or equals
    */
  var GE: js.Any
  /**
    * FilterOperator greater than
    */
  var GT: js.Any
  /**
    * FilterOperator less or equals
    */
  var LE: js.Any
  /**
    * FilterOperator less than
    */
  var LT: js.Any
  /**
    * FilterOperator not equals
    */
  var NE: js.Any
  /**
    * FilterOperator starts with
    */
  var StartsWith: js.Any
}

object Anon_BT {
  @scala.inline
  def apply(
    BT: js.Any,
    Contains: js.Any,
    EQ: js.Any,
    EndsWith: js.Any,
    GE: js.Any,
    GT: js.Any,
    LE: js.Any,
    LT: js.Any,
    NE: js.Any,
    StartsWith: js.Any
  ): Anon_BT = {
    val __obj = js.Dynamic.literal(BT = BT, Contains = Contains, EQ = EQ, EndsWith = EndsWith, GE = GE, GT = GT, LE = LE, LT = LT, NE = NE, StartsWith = StartsWith)
  
    __obj.asInstanceOf[Anon_BT]
  }
}

