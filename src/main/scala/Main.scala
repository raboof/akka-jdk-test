package akka.remote.artery

import java.nio.ByteBuffer
import akka.remote.artery.EnvelopeBuffer

object Main extends App {
  val buf = new EnvelopeBuffer(ByteBuffer.allocateDirect(100))
  buf.writeHeader(null)
}
