package typings
package aceDashDiffLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Connector extends js.Object {
  var connector: java.lang.String
  var deletedCodeConnectorLinkContent: java.lang.String
  var diff: java.lang.String
  var newCodeConnectorLinkContent: java.lang.String
}

object Anon_Connector {
  @scala.inline
  def apply(
    connector: java.lang.String,
    deletedCodeConnectorLinkContent: java.lang.String,
    diff: java.lang.String,
    newCodeConnectorLinkContent: java.lang.String
  ): Anon_Connector = {
    val __obj = js.Dynamic.literal(connector = connector, deletedCodeConnectorLinkContent = deletedCodeConnectorLinkContent, diff = diff, newCodeConnectorLinkContent = newCodeConnectorLinkContent)
  
    __obj.asInstanceOf[Anon_Connector]
  }
}

