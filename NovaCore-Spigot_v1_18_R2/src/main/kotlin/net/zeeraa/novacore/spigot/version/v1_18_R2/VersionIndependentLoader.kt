package net.zeeraa.novacore.spigot.version.v1_18_R2

import net.novauniverse.spigot.version.shared.v1_16plus.NativeParticleImplementation
import net.zeeraa.novacore.spigot.abstraction.CommandRegistrator
import net.zeeraa.novacore.spigot.abstraction.Listeners
import net.zeeraa.novacore.spigot.abstraction.VersionIndependantLoader
import net.zeeraa.novacore.spigot.abstraction.particle.NovaParticleProvider

class VersionIndependentLoader : VersionIndependantLoader() {
	override fun getCommandRegistrator(): CommandRegistrator {
		return NMSBasedCommandRegistrator()
	}

	override fun getVersionIndependentUtils(): VersionIndependentUtilsImplementation {
		return VersionIndependentUtilsImplementation(this)
	}

	override fun getListeners(): Listeners {
		return ListenersImplementation()
	}

	override fun getVersionSpecificParticleProvider(): NovaParticleProvider {
		return NativeParticleImplementation()
	}
}