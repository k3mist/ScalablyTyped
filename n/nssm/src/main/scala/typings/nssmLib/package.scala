package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object nssmLib {
  type CallbackFn = js.Function2[
    /* error */ js.UndefOr[java.lang.String], 
    /* result */ js.UndefOr[java.lang.String], 
    scala.Unit
  ]
  type NssmCatch[T] = js.Function1[
    /* onrejected */ js.UndefOr[
      (js.Function2[
        /* reason */ stdLib.Error, 
        /* stderr */ java.lang.String, 
        js.Any | js.Thenable[js.Any]
      ]) | scala.Null
    ], 
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NssmPromise<T | TResult> */ js.Any
  ]
  type NssmCommandFn = ZeroArgCommandFn with OneArgCommandFn with TwoArgCommandFn with PromiseCommandFn
  type NssmThen[T] = js.Function2[
    /* onfulfilled */ js.UndefOr[(js.Function1[/* value */ T, js.Any | js.Thenable[js.Any]]) | scala.Null], 
    /* onrejected */ js.UndefOr[
      (js.Function2[
        /* reason */ stdLib.Error, 
        /* stderr */ java.lang.String, 
        js.Any | js.Thenable[js.Any]
      ]) | scala.Null
    ], 
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NssmPromise<TResult1 | TResult2> */ js.Any
  ]
  type OneArgCommandFn = js.Function2[/* arg1 */ java.lang.String, /* callback */ CallbackFn, scala.Unit]
  type PromiseCommandFn = js.Function2[
    /* arg1 */ js.UndefOr[java.lang.String], 
    /* arg2 */ js.UndefOr[java.lang.String], 
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NssmPromise<string> */ js.Any
  ]
  type TwoArgCommandFn = js.Function3[
    /* arg1 */ java.lang.String, 
    /* arg2 */ java.lang.String, 
    /* callback */ CallbackFn, 
    scala.Unit
  ]
  type ZeroArgCommandFn = js.Function1[/* callback */ CallbackFn, scala.Unit]
}
