package typings
package couchbaseLib.couchbaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CounterOptions extends js.Object {
  /**
    * Set the initial expiration time for the document. A value of 0 represents never expiring.
    */
  var expiry: js.UndefOr[scala.Double] = js.undefined
  /**
    * Sets the initial value for the document if it does not exist. Specifying a value of undefined will cause the operation to fail if the document does not exist, otherwise this value must be equal to or greater than 0.
    */
  var initial: js.UndefOr[scala.Double] = js.undefined
  /**
    * Ensures this operation is persisted to this many nodes
    */
  var persist_to: js.UndefOr[scala.Double] = js.undefined
  /**
    * Ensures this operation is replicated to this many nodes
    */
  var replicate_to: js.UndefOr[scala.Double] = js.undefined
}

object CounterOptions {
  @scala.inline
  def apply(
    expiry: scala.Int | scala.Double = null,
    initial: scala.Int | scala.Double = null,
    persist_to: scala.Int | scala.Double = null,
    replicate_to: scala.Int | scala.Double = null
  ): CounterOptions = {
    val __obj = js.Dynamic.literal()
    if (expiry != null) __obj.updateDynamic("expiry")(expiry.asInstanceOf[js.Any])
    if (initial != null) __obj.updateDynamic("initial")(initial.asInstanceOf[js.Any])
    if (persist_to != null) __obj.updateDynamic("persist_to")(persist_to.asInstanceOf[js.Any])
    if (replicate_to != null) __obj.updateDynamic("replicate_to")(replicate_to.asInstanceOf[js.Any])
    __obj.asInstanceOf[CounterOptions]
  }
}

