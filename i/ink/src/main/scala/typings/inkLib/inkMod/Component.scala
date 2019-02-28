package typings
package inkLib.inkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ink", "Component")
@js.native
abstract class Component[P /* <: stdLib.Record[java.lang.String, _] */, S /* <: stdLib.Record[java.lang.String, _] */, C /* <: stdLib.Record[java.lang.String, _] */] () extends js.Object {
  var componentDidMount: js.UndefOr[js.Function0[scala.Unit]] = js.native
  var componentDidUpdate: js.UndefOr[js.Function0[scala.Unit]] = js.native
  var componentWillMount: js.UndefOr[js.Function0[scala.Unit]] = js.native
  var componentWillReceiveProps: js.UndefOr[
    js.Function2[
      /* nextProps */ js.Object with inkLib.Anon_Children, 
      /* nextState */ js.Object, 
      scala.Unit
    ]
  ] = js.native
  var componentWillUnmount: js.UndefOr[js.Function0[scala.Unit]] = js.native
  var componentWillUpdate: js.UndefOr[
    js.Function2[
      /* nextProps */ js.Object with inkLib.Anon_Children, 
      /* nextState */ js.Object, 
      scala.Unit
    ]
  ] = js.native
  val context: C = js.native
  var getChildContext: js.UndefOr[js.Function0[js.Function0[stdLib.Record[java.lang.String, _]]]] = js.native
  val props: P with inkLib.Anon_Children = js.native
  var shouldComponentUpdate: js.UndefOr[
    js.Function2[
      /* nextProps */ js.Object with inkLib.Anon_Children, 
      /* nextState */ js.Object, 
      scala.Unit
    ]
  ] = js.native
  var state: S = js.native
  def render(props: js.Object with inkLib.Anon_Children, state: js.Object, context: js.Object): InkElement = js.native
  def setState(nextState: js.Function1[/* state */ js.Object, stdLib.Partial[js.Object]]): scala.Unit = js.native
  def setState(
    nextState: js.Function1[/* state */ js.Object, stdLib.Partial[js.Object]],
    callback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def setState(nextState: stdLib.Partial[js.Object]): scala.Unit = js.native
  def setState(nextState: stdLib.Partial[js.Object], callback: js.Function0[scala.Unit]): scala.Unit = js.native
}

