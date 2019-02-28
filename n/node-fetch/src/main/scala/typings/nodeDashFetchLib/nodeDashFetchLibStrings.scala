package typings
package nodeDashFetchLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object nodeDashFetchLibStrings {
  @js.native
  sealed trait FetchError extends js.Object
  
  @js.native
  sealed trait audio
    extends nodeDashFetchLib.nodeDashFetchMod.RequestContext
  
  @js.native
  sealed trait basic
    extends nodeDashFetchLib.nodeDashFetchMod.ResponseType
  
  @js.native
  sealed trait beacon
    extends nodeDashFetchLib.nodeDashFetchMod.RequestContext
  
  @js.native
  sealed trait cors
    extends nodeDashFetchLib.nodeDashFetchMod.RequestMode
       with nodeDashFetchLib.nodeDashFetchMod.ResponseType
  
  @js.native
  sealed trait cspreport
    extends nodeDashFetchLib.nodeDashFetchMod.RequestContext
  
  @js.native
  sealed trait default
    extends nodeDashFetchLib.nodeDashFetchMod.RequestCache
       with nodeDashFetchLib.nodeDashFetchMod.ResponseType
  
  @js.native
  sealed trait download
    extends nodeDashFetchLib.nodeDashFetchMod.RequestContext
  
  @js.native
  sealed trait embed
    extends nodeDashFetchLib.nodeDashFetchMod.RequestContext
  
  @js.native
  sealed trait error
    extends nodeDashFetchLib.nodeDashFetchMod.RequestRedirect
       with nodeDashFetchLib.nodeDashFetchMod.ResponseType
  
  @js.native
  sealed trait eventsource
    extends nodeDashFetchLib.nodeDashFetchMod.RequestContext
  
  @js.native
  sealed trait favicon
    extends nodeDashFetchLib.nodeDashFetchMod.RequestContext
  
  @js.native
  sealed trait fetch
    extends nodeDashFetchLib.nodeDashFetchMod.RequestContext
  
  @js.native
  sealed trait follow
    extends nodeDashFetchLib.nodeDashFetchMod.RequestRedirect
  
  @js.native
  sealed trait font
    extends nodeDashFetchLib.nodeDashFetchMod.RequestContext
  
  @js.native
  sealed trait `force-cache`
    extends nodeDashFetchLib.nodeDashFetchMod.RequestCache
  
  @js.native
  sealed trait form
    extends nodeDashFetchLib.nodeDashFetchMod.RequestContext
  
  @js.native
  sealed trait frame
    extends nodeDashFetchLib.nodeDashFetchMod.RequestContext
  
  @js.native
  sealed trait hyperlink
    extends nodeDashFetchLib.nodeDashFetchMod.RequestContext
  
  @js.native
  sealed trait iframe
    extends nodeDashFetchLib.nodeDashFetchMod.RequestContext
  
  @js.native
  sealed trait image
    extends nodeDashFetchLib.nodeDashFetchMod.RequestContext
  
  @js.native
  sealed trait imageset
    extends nodeDashFetchLib.nodeDashFetchMod.RequestContext
  
  @js.native
  sealed trait `import`
    extends nodeDashFetchLib.nodeDashFetchMod.RequestContext
  
  @js.native
  sealed trait include
    extends nodeDashFetchLib.nodeDashFetchMod.RequestCredentials
  
  @js.native
  sealed trait internal
    extends nodeDashFetchLib.nodeDashFetchMod.RequestContext
  
  @js.native
  sealed trait location
    extends nodeDashFetchLib.nodeDashFetchMod.RequestContext
  
  @js.native
  sealed trait manifest
    extends nodeDashFetchLib.nodeDashFetchMod.RequestContext
  
  @js.native
  sealed trait manual
    extends nodeDashFetchLib.nodeDashFetchMod.RequestRedirect
  
  @js.native
  sealed trait `no-cache`
    extends nodeDashFetchLib.nodeDashFetchMod.RequestCache
  
  @js.native
  sealed trait `no-cors`
    extends nodeDashFetchLib.nodeDashFetchMod.RequestMode
  
  @js.native
  sealed trait `no-store`
    extends nodeDashFetchLib.nodeDashFetchMod.RequestCache
  
  @js.native
  sealed trait `object`
    extends nodeDashFetchLib.nodeDashFetchMod.RequestContext
  
  @js.native
  sealed trait omit
    extends nodeDashFetchLib.nodeDashFetchMod.RequestCredentials
  
  @js.native
  sealed trait `only-if-cached`
    extends nodeDashFetchLib.nodeDashFetchMod.RequestCache
  
  @js.native
  sealed trait opaque
    extends nodeDashFetchLib.nodeDashFetchMod.ResponseType
  
  @js.native
  sealed trait opaqueredirect
    extends nodeDashFetchLib.nodeDashFetchMod.ResponseType
  
  @js.native
  sealed trait ping
    extends nodeDashFetchLib.nodeDashFetchMod.RequestContext
  
  @js.native
  sealed trait plugin
    extends nodeDashFetchLib.nodeDashFetchMod.RequestContext
  
  @js.native
  sealed trait prefetch
    extends nodeDashFetchLib.nodeDashFetchMod.RequestContext
  
  @js.native
  sealed trait reload
    extends nodeDashFetchLib.nodeDashFetchMod.RequestCache
  
  @js.native
  sealed trait `same-origin`
    extends nodeDashFetchLib.nodeDashFetchMod.RequestCredentials
       with nodeDashFetchLib.nodeDashFetchMod.RequestMode
  
  @js.native
  sealed trait script
    extends nodeDashFetchLib.nodeDashFetchMod.RequestContext
  
  @js.native
  sealed trait serviceworker
    extends nodeDashFetchLib.nodeDashFetchMod.RequestContext
  
  @js.native
  sealed trait sharedworker
    extends nodeDashFetchLib.nodeDashFetchMod.RequestContext
  
  @js.native
  sealed trait style
    extends nodeDashFetchLib.nodeDashFetchMod.RequestContext
  
  @js.native
  sealed trait subresource
    extends nodeDashFetchLib.nodeDashFetchMod.RequestContext
  
  @js.native
  sealed trait track
    extends nodeDashFetchLib.nodeDashFetchMod.RequestContext
  
  @js.native
  sealed trait video
    extends nodeDashFetchLib.nodeDashFetchMod.RequestContext
  
  @js.native
  sealed trait worker
    extends nodeDashFetchLib.nodeDashFetchMod.RequestContext
  
  @js.native
  sealed trait xmlhttprequest
    extends nodeDashFetchLib.nodeDashFetchMod.RequestContext
  
  @js.native
  sealed trait xslt
    extends nodeDashFetchLib.nodeDashFetchMod.RequestContext
  
  @scala.inline
  def FetchError: FetchError = "FetchError".asInstanceOf[FetchError]
  @scala.inline
  def audio: audio = "audio".asInstanceOf[audio]
  @scala.inline
  def basic: basic = "basic".asInstanceOf[basic]
  @scala.inline
  def beacon: beacon = "beacon".asInstanceOf[beacon]
  @scala.inline
  def cors: cors = "cors".asInstanceOf[cors]
  @scala.inline
  def cspreport: cspreport = "cspreport".asInstanceOf[cspreport]
  @scala.inline
  def default: default = "default".asInstanceOf[default]
  @scala.inline
  def download: download = "download".asInstanceOf[download]
  @scala.inline
  def embed: embed = "embed".asInstanceOf[embed]
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def eventsource: eventsource = "eventsource".asInstanceOf[eventsource]
  @scala.inline
  def favicon: favicon = "favicon".asInstanceOf[favicon]
  @scala.inline
  def fetch: fetch = "fetch".asInstanceOf[fetch]
  @scala.inline
  def follow: follow = "follow".asInstanceOf[follow]
  @scala.inline
  def font: font = "font".asInstanceOf[font]
  @scala.inline
  def `force-cache`: `force-cache` = "force-cache".asInstanceOf[`force-cache`]
  @scala.inline
  def form: form = "form".asInstanceOf[form]
  @scala.inline
  def frame: frame = "frame".asInstanceOf[frame]
  @scala.inline
  def hyperlink: hyperlink = "hyperlink".asInstanceOf[hyperlink]
  @scala.inline
  def iframe: iframe = "iframe".asInstanceOf[iframe]
  @scala.inline
  def image: image = "image".asInstanceOf[image]
  @scala.inline
  def imageset: imageset = "imageset".asInstanceOf[imageset]
  @scala.inline
  def `import`: `import` = "import".asInstanceOf[`import`]
  @scala.inline
  def include: include = "include".asInstanceOf[include]
  @scala.inline
  def internal: internal = "internal".asInstanceOf[internal]
  @scala.inline
  def location: location = "location".asInstanceOf[location]
  @scala.inline
  def manifest: manifest = "manifest".asInstanceOf[manifest]
  @scala.inline
  def manual: manual = "manual".asInstanceOf[manual]
  @scala.inline
  def `no-cache`: `no-cache` = "no-cache".asInstanceOf[`no-cache`]
  @scala.inline
  def `no-cors`: `no-cors` = "no-cors".asInstanceOf[`no-cors`]
  @scala.inline
  def `no-store`: `no-store` = "no-store".asInstanceOf[`no-store`]
  @scala.inline
  def `object`: `object` = "object".asInstanceOf[`object`]
  @scala.inline
  def omit: omit = "omit".asInstanceOf[omit]
  @scala.inline
  def `only-if-cached`: `only-if-cached` = "only-if-cached".asInstanceOf[`only-if-cached`]
  @scala.inline
  def opaque: opaque = "opaque".asInstanceOf[opaque]
  @scala.inline
  def opaqueredirect: opaqueredirect = "opaqueredirect".asInstanceOf[opaqueredirect]
  @scala.inline
  def ping: ping = "ping".asInstanceOf[ping]
  @scala.inline
  def plugin: plugin = "plugin".asInstanceOf[plugin]
  @scala.inline
  def prefetch: prefetch = "prefetch".asInstanceOf[prefetch]
  @scala.inline
  def reload: reload = "reload".asInstanceOf[reload]
  @scala.inline
  def `same-origin`: `same-origin` = "same-origin".asInstanceOf[`same-origin`]
  @scala.inline
  def script: script = "script".asInstanceOf[script]
  @scala.inline
  def serviceworker: serviceworker = "serviceworker".asInstanceOf[serviceworker]
  @scala.inline
  def sharedworker: sharedworker = "sharedworker".asInstanceOf[sharedworker]
  @scala.inline
  def style: style = "style".asInstanceOf[style]
  @scala.inline
  def subresource: subresource = "subresource".asInstanceOf[subresource]
  @scala.inline
  def track: track = "track".asInstanceOf[track]
  @scala.inline
  def video: video = "video".asInstanceOf[video]
  @scala.inline
  def worker: worker = "worker".asInstanceOf[worker]
  @scala.inline
  def xmlhttprequest: xmlhttprequest = "xmlhttprequest".asInstanceOf[xmlhttprequest]
  @scala.inline
  def xslt: xslt = "xslt".asInstanceOf[xslt]
}

