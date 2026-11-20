# Floppy

#### The mod that makes your fish flop their way to the water.
This mod adds a small velocity adjustment to bring out-of-water fish toward the nearest water source. It also works with mobs that extend Minecraft's AbstractFish class.

## Building

The default local target is Minecraft 26.1.2 (requiring Java 25; NeoForge 26.x uses ModDevGradle while 1.21.x and Fabric use Architectury Loom). GitHub Actions builds all loader and version variants using the workflow matrix.

```bash
./gradlew :fabric:build -Pfabric_only=true
./gradlew :neoforge:build
```

## License

MIT. See [LICENSE.md](LICENSE.md).
