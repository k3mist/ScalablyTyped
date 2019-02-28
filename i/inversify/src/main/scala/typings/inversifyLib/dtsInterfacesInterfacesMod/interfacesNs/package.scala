package typings
package inversifyLib.dtsInterfacesInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object interfacesNs {
  type AsyncContainerModuleCallBack = js.Function4[
    /* bind */ Bind, 
    /* unbind */ Unbind, 
    /* isBound */ IsBound, 
    /* rebind */ Rebind, 
    js.Promise[scala.Unit]
  ]
  type Bind = js.Function1[/* serviceIdentifier */ ServiceIdentifier[js.Any], BindingToSyntax[js.Any]]
  type ContainerModuleCallBack = js.Function4[
    /* bind */ Bind, 
    /* unbind */ Unbind, 
    /* isBound */ IsBound, 
    /* rebind */ Rebind, 
    scala.Unit
  ]
  type ContextInterceptor = js.Function1[/* context */ Context, Context]
  type Factory[T] = js.Function1[/* repeated */ js.Any, (js.Function1[/* repeated */ js.Any, T]) | T]
  type FactoryCreator[T] = js.Function1[/* context */ Context, Factory[T]]
  type IsBound = js.Function1[/* serviceIdentifier */ ServiceIdentifier[js.Any], scala.Boolean]
  type Middleware = js.Function1[/* next */ Next, Next]
  type Next = js.Function1[/* args */ NextArgs, js.Any | js.Array[js.Any]]
  type Provider[T] = js.Function1[
    /* repeated */ js.Any, 
    (js.Function1[/* repeated */ js.Any, js.Promise[T]]) | js.Promise[T]
  ]
  type ProviderCreator[T] = js.Function1[/* context */ Context, Provider[T]]
  type Rebind = js.Function1[/* serviceIdentifier */ ServiceIdentifier[js.Any], BindingToSyntax[js.Any]]
  type RequestScope = (stdLib.Map[js.Any, js.Any]) | scala.Null
  type ResolveRequestHandler = js.Function1[/* request */ Request, js.Any]
  type ServiceIdentifier[T] = _ServiceIdentifier[T] | java.lang.String | js.Symbol
  type Unbind = js.Function1[/* serviceIdentifier */ ServiceIdentifier[js.Any], scala.Unit]
}
