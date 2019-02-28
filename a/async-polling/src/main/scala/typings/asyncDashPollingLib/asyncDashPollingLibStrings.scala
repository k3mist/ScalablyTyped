package typings
package asyncDashPollingLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object asyncDashPollingLibStrings {
  @js.native
  sealed trait end
    extends asyncDashPollingLib.asyncDashPollingMod.AsyncPollingNs.EventName
  
  @js.native
  sealed trait error
    extends asyncDashPollingLib.asyncDashPollingMod.AsyncPollingNs.EventName
  
  @js.native
  sealed trait result
    extends asyncDashPollingLib.asyncDashPollingMod.AsyncPollingNs.EventName
  
  @js.native
  sealed trait run
    extends asyncDashPollingLib.asyncDashPollingMod.AsyncPollingNs.EventName
  
  @js.native
  sealed trait schedule
    extends asyncDashPollingLib.asyncDashPollingMod.AsyncPollingNs.EventName
  
  @js.native
  sealed trait start
    extends asyncDashPollingLib.asyncDashPollingMod.AsyncPollingNs.EventName
  
  @js.native
  sealed trait stop
    extends asyncDashPollingLib.asyncDashPollingMod.AsyncPollingNs.EventName
  
  @scala.inline
  def end: end = "end".asInstanceOf[end]
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def result: result = "result".asInstanceOf[result]
  @scala.inline
  def run: run = "run".asInstanceOf[run]
  @scala.inline
  def schedule: schedule = "schedule".asInstanceOf[schedule]
  @scala.inline
  def start: start = "start".asInstanceOf[start]
  @scala.inline
  def stop: stop = "stop".asInstanceOf[stop]
}

