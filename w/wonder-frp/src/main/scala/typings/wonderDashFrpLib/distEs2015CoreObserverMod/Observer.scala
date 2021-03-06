package typings
package wonderDashFrpLib.distEs2015CoreObserverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015/core/Observer", "Observer")
@js.native
abstract class Observer protected ()
  extends wonderDashFrpLib.distEs2015CoreEntityMod.Entity
     with wonderDashFrpLib.distEs2015ObserverIObserverMod.IObserver {
  def this(observer: wonderDashFrpLib.distEs2015ObserverIObserverMod.IObserver) = this()
  def this(onNext: js.Function, onError: js.Function, onCompleted: js.Function) = this()
  var _disposable: js.Any = js.native
  var _isDisposed: js.Any = js.native
  var _isStop: js.Any = js.native
  var isDisposed: scala.Boolean = js.native
  var onUserCompleted: js.Function = js.native
  var onUserError: js.Function = js.native
  var onUserNext: js.Function = js.native
  /* CompleteClass */
  override def completed(): js.Any = js.native
  /* CompleteClass */
  override def dispose(): scala.Unit = js.native
  /* CompleteClass */
  override def error(error: js.Any): js.Any = js.native
  /* CompleteClass */
  override def next(value: js.Any): js.Any = js.native
  /* protected */ def onCompleted(): js.Any = js.native
  /* protected */ def onError(error: js.Any): js.Any = js.native
  /* protected */ def onNext(value: js.Any): js.Any = js.native
  def setDisposable(disposable: wonderDashFrpLib.distEs2015DisposableIDisposableMod.IDisposable): scala.Unit = js.native
}

