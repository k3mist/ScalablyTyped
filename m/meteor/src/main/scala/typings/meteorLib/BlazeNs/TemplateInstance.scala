package typings
package meteorLib.BlazeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TemplateInstance extends js.Object {
  var data: js.Object
  var firstNode: js.Object
  var lastNode: js.Object
  var view: js.Object
  @JSName("$")
  def $(selector: java.lang.String): js.Any
  def autorun(runFunc: js.Function1[/* computation */ meteorLib.TrackerNs.Computation, scala.Unit]): meteorLib.TrackerNs.Computation
  def find(selector: java.lang.String): reactLib.HTMLElement
  def findAll(selector: java.lang.String): js.Array[reactLib.HTMLElement]
  def subscribe(name: java.lang.String, args: js.Any*): meteorLib.MeteorNs.SubscriptionHandle
  def subscriptionsReady(): scala.Boolean
}

object TemplateInstance {
  @scala.inline
  def apply(
    $: js.Function1[java.lang.String, js.Any],
    autorun: js.Function1[
      js.Function1[/* computation */ meteorLib.TrackerNs.Computation, scala.Unit], 
      meteorLib.TrackerNs.Computation
    ],
    data: js.Object,
    find: js.Function1[java.lang.String, reactLib.HTMLElement],
    findAll: js.Function1[java.lang.String, js.Array[reactLib.HTMLElement]],
    firstNode: js.Object,
    lastNode: js.Object,
    subscribe: js.Function2[java.lang.String, /* repeated */ js.Any, meteorLib.MeteorNs.SubscriptionHandle],
    subscriptionsReady: js.Function0[scala.Boolean],
    view: js.Object
  ): TemplateInstance = {
    val __obj = js.Dynamic.literal($ = $, autorun = autorun, data = data, find = find, findAll = findAll, firstNode = firstNode, lastNode = lastNode, subscribe = subscribe, subscriptionsReady = subscriptionsReady, view = view)
  
    __obj.asInstanceOf[TemplateInstance]
  }
}

