package typings
package jqueryLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BindType
  extends jqueryLib.JQueryNs._SpecialEventHook[js.Any, js.Any] {
  /**
    * When defined, these string properties specify that a special event should be handled like another event type until the event is delivered. The `bindType` is used if the event is attached directly, and the `delegateType` is used for delegated events. These types are generally DOM event types, and _should not_ be a special event themselves.
    * @see \`{@link https://learn.jquery.com/events/event-extensions/#bindtype-string-delegatetype-string }\`
    */
  var bindType: java.lang.String
}

object Anon_BindType {
  @scala.inline
  def apply(bindType: java.lang.String): Anon_BindType = {
    val __obj = js.Dynamic.literal(bindType = bindType)
  
    __obj.asInstanceOf[Anon_BindType]
  }
}

