package typings
package oracledbLib.oracledbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object oracledbNs {
  type TFunc[T, R] = js.Function1[/* value */ T, TRet[R]]
  type TRet[T] = T | IPromise[T]
}
