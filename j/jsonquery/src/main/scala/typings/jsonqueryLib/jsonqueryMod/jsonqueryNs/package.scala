package typings
package jsonqueryLib.jsonqueryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jsonqueryNs {
  type Query[T] = _Query[T] | QueryValue[T]
  type QueryValue[T] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]:? T[P] | jsonquery.jsonquery.jsonquery.BaseCondition<T[P]>}
    */ jsonqueryLib.jsonqueryLibStrings.QueryValue with js.Any
}
