package typings
package dvaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object dvaLibStrings {
  @js.native
  sealed trait matchPath extends js.Object
  
  @js.native
  sealed trait takeEvery
    extends dvaLib.dvaMod.EffectType
  
  @js.native
  sealed trait takeLatest
    extends dvaLib.dvaMod.EffectType
  
  @js.native
  sealed trait throttle
    extends dvaLib.dvaMod.EffectType
  
  @js.native
  sealed trait watcher
    extends dvaLib.dvaMod.EffectType
  
  @scala.inline
  def matchPath: matchPath = "matchPath".asInstanceOf[matchPath]
  @scala.inline
  def takeEvery: takeEvery = "takeEvery".asInstanceOf[takeEvery]
  @scala.inline
  def takeLatest: takeLatest = "takeLatest".asInstanceOf[takeLatest]
  @scala.inline
  def throttle: throttle = "throttle".asInstanceOf[throttle]
  @scala.inline
  def watcher: watcher = "watcher".asInstanceOf[watcher]
}

