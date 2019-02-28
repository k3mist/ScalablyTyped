package typings
package ravenDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ravenDashJsLibStrings {
  @js.native
  sealed trait critical
    extends ravenDashJsLib.ravenDashJsMod.RavenNs.LogLevel
  
  @js.native
  sealed trait debug
    extends ravenDashJsLib.ravenDashJsMod.RavenNs.LogLevel
  
  @js.native
  sealed trait error
    extends ravenDashJsLib.ravenDashJsMod.RavenNs.LogLevel
  
  @js.native
  sealed trait http
    extends ravenDashJsLib.ravenDashJsMod.RavenNs.BreadcrumbType
  
  @js.native
  sealed trait info
    extends ravenDashJsLib.ravenDashJsMod.RavenNs.LogLevel
  
  @js.native
  sealed trait log
    extends ravenDashJsLib.ravenDashJsMod.RavenNs.LogLevel
  
  @js.native
  sealed trait navigation
    extends ravenDashJsLib.ravenDashJsMod.RavenNs.BreadcrumbType
  
  @js.native
  sealed trait warn
    extends ravenDashJsLib.ravenDashJsMod.RavenNs.LogLevel
  
  @js.native
  sealed trait warning
    extends ravenDashJsLib.ravenDashJsMod.RavenNs.LogLevel
  
  @scala.inline
  def critical: critical = "critical".asInstanceOf[critical]
  @scala.inline
  def debug: debug = "debug".asInstanceOf[debug]
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def http: http = "http".asInstanceOf[http]
  @scala.inline
  def info: info = "info".asInstanceOf[info]
  @scala.inline
  def log: log = "log".asInstanceOf[log]
  @scala.inline
  def navigation: navigation = "navigation".asInstanceOf[navigation]
  @scala.inline
  def warn: warn = "warn".asInstanceOf[warn]
  @scala.inline
  def warning: warning = "warning".asInstanceOf[warning]
}

