package typings
package javascriptDashStateDashMachineLib.javascriptDashStateDashMachineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StateMachineConfig extends js.Object {
  var callbacks: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[
      js.Function4[
        /* event */ js.UndefOr[java.lang.String], 
        /* from */ js.UndefOr[java.lang.String], 
        /* to */ js.UndefOr[java.lang.String], 
        /* repeated */ js.Any, 
        _
      ]
    ]
  ] = js.undefined
  var error: js.UndefOr[StateMachineErrorCallback] = js.undefined
   // string or { state: 'foo', event: 'setup', defer: true|false }
  var events: js.UndefOr[js.Array[StateMachineEventDef]] = js.undefined
  var initial: js.UndefOr[js.Any] = js.undefined
  var target: js.UndefOr[StateMachine] = js.undefined
}

object StateMachineConfig {
  @scala.inline
  def apply(
    callbacks: org.scalablytyped.runtime.StringDictionary[
      js.Function4[
        /* event */ js.UndefOr[java.lang.String], 
        /* from */ js.UndefOr[java.lang.String], 
        /* to */ js.UndefOr[java.lang.String], 
        /* repeated */ js.Any, 
        _
      ]
    ] = null,
    error: StateMachineErrorCallback = null,
    events: js.Array[StateMachineEventDef] = null,
    initial: js.Any = null,
    target: StateMachine = null
  ): StateMachineConfig = {
    val __obj = js.Dynamic.literal()
    if (callbacks != null) __obj.updateDynamic("callbacks")(callbacks)
    if (error != null) __obj.updateDynamic("error")(error)
    if (events != null) __obj.updateDynamic("events")(events)
    if (initial != null) __obj.updateDynamic("initial")(initial)
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[StateMachineConfig]
  }
}

