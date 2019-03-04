package typings
package reactLib.reactMod.ReactNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
// Component Specs and Lifecycle
// ----------------------------------------------------------------------
// This should actually be something like `Lifecycle<P, S> | DeprecatedLifecycle<P, S>`,
// as React will _not_ call the deprecated lifecycle methods if any of the new lifecycle
// methods are present.
trait ComponentLifecycle[P, S, SS]
  extends NewLifecycle[P, S, SS]
     with DeprecatedLifecycle[P, S] {
  /**
    * Catches exceptions generated in descendant components. Unhandled exceptions will cause
    * the entire component tree to unmount.
    */
  var componentDidCatch: js.UndefOr[js.Function2[/* error */ stdLib.Error, /* errorInfo */ ErrorInfo, scala.Unit]] = js.undefined
  /**
    * Called immediately after a component is mounted. Setting state here will trigger re-rendering.
    */
  var componentDidMount: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * Called immediately before a component is destroyed. Perform any necessary cleanup in this method, such as
    * cancelled network requests, or cleaning up any DOM elements created in `componentDidMount`.
    */
  var componentWillUnmount: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * Called to determine whether the change in props and state should trigger a re-render.
    *
    * `Component` always returns true.
    * `PureComponent` implements a shallow comparison on props and state and returns true if any
    * props or states have changed.
    *
    * If false is returned, `Component#render`, `componentWillUpdate`
    * and `componentDidUpdate` will not be called.
    */
  var shouldComponentUpdate: js.UndefOr[
    js.Function3[
      /* nextProps */ stdLib.Readonly[P], 
      /* nextState */ stdLib.Readonly[S], 
      /* nextContext */ js.Any, 
      scala.Boolean
    ]
  ] = js.undefined
}

object ComponentLifecycle {
  @scala.inline
  def apply[P, S, SS](
    UNSAFE_componentWillMount: () => scala.Unit = null,
    UNSAFE_componentWillReceiveProps: (/* nextProps */ stdLib.Readonly[P], /* nextContext */ js.Any) => scala.Unit = null,
    UNSAFE_componentWillUpdate: (/* nextProps */ stdLib.Readonly[P], /* nextState */ stdLib.Readonly[S], /* nextContext */ js.Any) => scala.Unit = null,
    componentDidCatch: (/* error */ stdLib.Error, /* errorInfo */ ErrorInfo) => scala.Unit = null,
    componentDidMount: () => scala.Unit = null,
    componentDidUpdate: (/* prevProps */ stdLib.Readonly[P], /* prevState */ stdLib.Readonly[S], /* snapshot */ js.UndefOr[SS]) => scala.Unit = null,
    componentWillMount: () => scala.Unit = null,
    componentWillReceiveProps: (/* nextProps */ stdLib.Readonly[P], /* nextContext */ js.Any) => scala.Unit = null,
    componentWillUnmount: () => scala.Unit = null,
    componentWillUpdate: (/* nextProps */ stdLib.Readonly[P], /* nextState */ stdLib.Readonly[S], /* nextContext */ js.Any) => scala.Unit = null,
    getSnapshotBeforeUpdate: (/* prevProps */ stdLib.Readonly[P], /* prevState */ stdLib.Readonly[S]) => SS | scala.Null = null,
    shouldComponentUpdate: (/* nextProps */ stdLib.Readonly[P], /* nextState */ stdLib.Readonly[S], /* nextContext */ js.Any) => scala.Boolean = null
  ): ComponentLifecycle[P, S, SS] = {
    val __obj = js.Dynamic.literal()
    if (UNSAFE_componentWillMount != null) __obj.updateDynamic("UNSAFE_componentWillMount")(js.Any.fromFunction0(UNSAFE_componentWillMount))
    if (UNSAFE_componentWillReceiveProps != null) __obj.updateDynamic("UNSAFE_componentWillReceiveProps")(js.Any.fromFunction2(UNSAFE_componentWillReceiveProps))
    if (UNSAFE_componentWillUpdate != null) __obj.updateDynamic("UNSAFE_componentWillUpdate")(js.Any.fromFunction3(UNSAFE_componentWillUpdate))
    if (componentDidCatch != null) __obj.updateDynamic("componentDidCatch")(js.Any.fromFunction2(componentDidCatch))
    if (componentDidMount != null) __obj.updateDynamic("componentDidMount")(js.Any.fromFunction0(componentDidMount))
    if (componentDidUpdate != null) __obj.updateDynamic("componentDidUpdate")(js.Any.fromFunction3(componentDidUpdate))
    if (componentWillMount != null) __obj.updateDynamic("componentWillMount")(js.Any.fromFunction0(componentWillMount))
    if (componentWillReceiveProps != null) __obj.updateDynamic("componentWillReceiveProps")(js.Any.fromFunction2(componentWillReceiveProps))
    if (componentWillUnmount != null) __obj.updateDynamic("componentWillUnmount")(js.Any.fromFunction0(componentWillUnmount))
    if (componentWillUpdate != null) __obj.updateDynamic("componentWillUpdate")(js.Any.fromFunction3(componentWillUpdate))
    if (getSnapshotBeforeUpdate != null) __obj.updateDynamic("getSnapshotBeforeUpdate")(js.Any.fromFunction2(getSnapshotBeforeUpdate))
    if (shouldComponentUpdate != null) __obj.updateDynamic("shouldComponentUpdate")(js.Any.fromFunction3(shouldComponentUpdate))
    __obj.asInstanceOf[ComponentLifecycle[P, S, SS]]
  }
}

