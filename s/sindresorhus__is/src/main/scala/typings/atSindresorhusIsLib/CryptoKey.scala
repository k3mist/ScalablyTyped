package typings
package atSindresorhusIsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CryptoKey extends js.Object {
  val algorithm: KeyAlgorithm
  val extractable: scala.Boolean
  val `type`: KeyType
  val usages: Array[KeyUsage]
}

@JSGlobal("CryptoKey")
@js.native
object CryptoKey
  extends org.scalablytyped.runtime.Instantiable0[CryptoKey]

