package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomXMLPrefixMappings extends js.Object {
  val Application: js.Any = js.native
  val Count: scala.Double = js.native
  val Creator: scala.Double = js.native
  val Parent: js.Any = js.native
  def apply(Index: java.lang.String): CustomXMLPrefixMapping = js.native
  def apply(Index: scala.Double): CustomXMLPrefixMapping = js.native
  def AddNamespace(Prefix: java.lang.String, NamespaceURI: java.lang.String): scala.Unit = js.native
  def Item(Index: java.lang.String): CustomXMLPrefixMapping = js.native
  def Item(Index: scala.Double): CustomXMLPrefixMapping = js.native
  def LookupNamespace(Prefix: java.lang.String): java.lang.String = js.native
  def LookupPrefix(NamespaceURI: java.lang.String): java.lang.String = js.native
}

