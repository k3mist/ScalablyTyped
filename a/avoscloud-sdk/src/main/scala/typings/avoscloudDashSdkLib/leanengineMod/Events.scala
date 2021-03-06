package typings
package avoscloudDashSdkLib.leanengineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  *
  * <p>AV.Events is a fork of Backbone's Events module, provided for your
  * convenience.</p>
  *
  * <p>A module that can be mixed in to any object in order to provide
  * it with custom events. You may bind callback functions to an event
  * with `on`, or remove these functions with `off`.
  * Triggering an event fires all callbacks in the order that `on` was
  * called.
  *
  * <pre>
  *     var object = {};
  *     _.extend(object, AV.Events);
  *     object.on('expand', function(){ alert('expanded'); });
  *     object.trigger('expand');</pre></p>
  *
  * <p>For more information, see the
  * <a href="http://documentcloud.github.com/backbone/#Events">Backbone
  * documentation</a>.</p>
  */
@JSImport("leanengine", "Events")
@js.native
class Events ()
  extends avoscloudDashSdkLib.avoscloudDashSdkMod.Events

/* static members */
@JSImport("leanengine", "Events")
@js.native
object Events extends js.Object {
  def bind(): avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.Events = js.native
  def off(events: js.Array[java.lang.String]): avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.Events = js.native
  def off(events: js.Array[java.lang.String], callback: js.Function): avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.Events = js.native
  def off(events: js.Array[java.lang.String], callback: js.Function, context: js.Any): avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.Events = js.native
  def on(events: js.Array[java.lang.String]): avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.Events = js.native
  def on(events: js.Array[java.lang.String], callback: js.Function): avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.Events = js.native
  def on(events: js.Array[java.lang.String], callback: js.Function, context: js.Any): avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.Events = js.native
  def trigger(events: js.Array[java.lang.String]): avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.Events = js.native
  def unbind(): avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.Events = js.native
}

