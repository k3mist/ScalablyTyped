package typings
package hapiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object hapiMod {
  type CachePolicyOptions[T] = catboxLib.catboxMod.PolicyOptionVariants[T] with hapiLib.Anon_Cache
  type CacheProvider[T /* <: catboxLib.catboxMod.ClientOptions */] = catboxLib.catboxMod.EnginePrototype[js.Any] | hapiLib.Anon_Constructor[T]
  type DecorateName = java.lang.String | js.Symbol
  type DecorationMethod[T] = js.ThisFunction1[/* this */ T, /* repeated */ js.Any, js.Any]
  type Dependencies = java.lang.String | js.Array[java.lang.String] | org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type LogEventHandler = js.Function2[
    /* event */ LogEvent, 
    /* tags */ org.scalablytyped.runtime.StringDictionary[hapiLib.hapiLibNumbers.`true`], 
    scala.Unit
  ]
  type PayloadCompressionDecoderSettings = js.Object
  type PeekListener = js.Function2[/* chunk */ java.lang.String, /* encoding */ java.lang.String, scala.Unit]
  type Plugin[T] = PluginBase[T] with (PluginNameVersion | PluginPackage)
  type RequestEventHandler = js.Function3[
    /* request */ Request, 
    /* event */ RequestEvent, 
    /* tags */ org.scalablytyped.runtime.StringDictionary[hapiLib.hapiLibNumbers.`true`], 
    scala.Unit
  ]
  type ResponseEventHandler = js.Function1[/* request */ Request, scala.Unit]
  type ResponseValue = java.lang.String | js.Object
  type RouteCompressionEncoderSettings = js.Object
  type RouteEventHandler = js.Function1[/* route */ RequestRoute, scala.Unit]
  type RouteOptionsAccessObject = _RouteOptionsAccessObject | (RouteOptionsAccessScopeObject with RouteOptionsAccessEntityObject)
  type RouteOptionsAccessScope = hapiLib.hapiLibNumbers.`false` | java.lang.String | js.Array[java.lang.String]
  type RouteOptionsCache = hapiLib.Anon_Default with (hapiLib.Anon_ExpiresAt | hapiLib.Anon_ExpiresAtExpiresIn | hapiLib.Anon_ExpiresAtExpiresInUndefined)
  type RouteOptionsPreAllOptions = RouteOptionsPreObject | js.Array[RouteOptionsPreObject] | hapiLib.hapiMod.LifecycleNs.Method
  type RouteOptionsPreArray = js.Array[RouteOptionsPreAllOptions]
  type RouteOptionsResponseSchema = scala.Boolean | ValidationObject | joiLib.joiMod.Schema | (js.Function2[
    /* value */ js.Object | nodeLib.Buffer | java.lang.String, 
    /* options */ joiLib.joiMod.ValidationOptions, 
    js.Promise[js.Any]
  ])
  type RouteOptionsSecure = scala.Boolean | RouteOptionsSecureObject
  type ServerAuthConfig = RouteOptionsAccess
  type ServerAuthScheme = js.Function2[
    /* server */ Server, 
    /* options */ js.UndefOr[ServerAuthSchemeOptions], 
    ServerAuthSchemeObject
  ]
  type ServerAuthSchemeOptions = js.Object
  type ServerEventsApplication = java.lang.String | ServerEventsApplicationObject | podiumLib.podiumMod.Podium
  type ServerExtPointFunction = js.Function1[/* server */ Server, scala.Unit]
  type ServerMethod = js.Function1[/* repeated */ js.Any, js.Any]
  type StartEventHandler = js.Function0[scala.Unit]
  type StopEventHandler = js.Function0[scala.Unit]
  type ValidationObject = joiLib.joiMod.SchemaMap
}
