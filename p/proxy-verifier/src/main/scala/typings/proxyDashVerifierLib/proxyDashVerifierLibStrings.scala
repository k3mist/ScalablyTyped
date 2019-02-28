package typings
package proxyDashVerifierLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object proxyDashVerifierLibStrings {
  @js.native
  sealed trait anonymous
    extends proxyDashVerifierLib.proxyDashVerifierMod.AnonymityLevel
  
  @js.native
  sealed trait elite
    extends proxyDashVerifierLib.proxyDashVerifierMod.AnonymityLevel
  
  @js.native
  sealed trait http
    extends proxyDashVerifierLib.proxyDashVerifierMod.Protocol
  
  @js.native
  sealed trait https
    extends proxyDashVerifierLib.proxyDashVerifierMod.Protocol
  
  @js.native
  sealed trait socks4
    extends proxyDashVerifierLib.proxyDashVerifierMod.Protocol
  
  @js.native
  sealed trait socks5
    extends proxyDashVerifierLib.proxyDashVerifierMod.Protocol
  
  @js.native
  sealed trait transparent
    extends proxyDashVerifierLib.proxyDashVerifierMod.AnonymityLevel
  
  @scala.inline
  def anonymous: anonymous = "anonymous".asInstanceOf[anonymous]
  @scala.inline
  def elite: elite = "elite".asInstanceOf[elite]
  @scala.inline
  def http: http = "http".asInstanceOf[http]
  @scala.inline
  def https: https = "https".asInstanceOf[https]
  @scala.inline
  def socks4: socks4 = "socks4".asInstanceOf[socks4]
  @scala.inline
  def socks5: socks5 = "socks5".asInstanceOf[socks5]
  @scala.inline
  def transparent: transparent = "transparent".asInstanceOf[transparent]
}

