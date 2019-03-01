package typings
package fmDashWebsyncLib.fmNs.websyncNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait publishingClient extends js.Object {
  /**
    * The publishing client's bound records.
    */
  var boundRecords: js.Any
  /**
    * The publishing client's unique identifier.
    */
  var id: java.lang.String
}

object publishingClient {
  @scala.inline
  def apply(boundRecords: js.Any, id: java.lang.String): publishingClient = {
    val __obj = js.Dynamic.literal(boundRecords = boundRecords, id = id)
  
    __obj.asInstanceOf[publishingClient]
  }
}

