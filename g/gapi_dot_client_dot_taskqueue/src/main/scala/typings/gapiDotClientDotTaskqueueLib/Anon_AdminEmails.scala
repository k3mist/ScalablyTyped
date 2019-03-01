package typings
package gapiDotClientDotTaskqueueLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AdminEmails extends js.Object {
  /** Email addresses of users who are "admins" of the TaskQueue. This means they can control the queue, eg set ACLs for the queue. */
  var adminEmails: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Email addresses of users who can "consume" tasks from the TaskQueue. This means they can Dequeue and Delete tasks from the queue. */
  var consumerEmails: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Email addresses of users who can "produce" tasks into the TaskQueue. This means they can Insert tasks into the queue. */
  var producerEmails: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object Anon_AdminEmails {
  @scala.inline
  def apply(
    adminEmails: js.Array[java.lang.String] = null,
    consumerEmails: js.Array[java.lang.String] = null,
    producerEmails: js.Array[java.lang.String] = null
  ): Anon_AdminEmails = {
    val __obj = js.Dynamic.literal()
    if (adminEmails != null) __obj.updateDynamic("adminEmails")(adminEmails)
    if (consumerEmails != null) __obj.updateDynamic("consumerEmails")(consumerEmails)
    if (producerEmails != null) __obj.updateDynamic("producerEmails")(producerEmails)
    __obj.asInstanceOf[Anon_AdminEmails]
  }
}

