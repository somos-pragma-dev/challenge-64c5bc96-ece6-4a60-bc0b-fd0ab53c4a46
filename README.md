# Simulación de Ciclo de Vida de Estado en Pipeline

El sistema de gestión de solicitudes de crédito necesita asegurar que el estado de cada solicitud progresa adecuadamente a través de las diferentes etapas del pipeline de evaluación. Los estados posibles son 'pendiente', 'en revisión', 'aprobado' y'rechazado'. El origen de las solicitudes es el 'originador de créditos', y el destino final es el'motor de decisiones de crédito'. El sistema debe manejar un volumen de 1 500 solicitudes por segundo en hora pico y garantizar la idempotencia del registro de solicitudes por número de operación. En caso de falla del 'motor de decisiones de crédito', el sistema debe reintentar la operación hasta 3 veces con un intervalo de 5 segundos entre intentos.

## Informacion General

| Campo | Valor |
|-------|-------|
| **Tema** | status-progression-test |
| **Nivel** | junior-l2 |
| **Tipo** | practical |
| **Tiempo estimado** | 4 horas |

## Fases del Reto

### Fase 0: Configuración del Proyecto

**Objetivo:** Obtener el proyecto base funcional enviando el Código Base a un asistente de IA, que lo analizará, corregirá errores y generará un ZIP listo para usar.

**Tiempo estimado:** 15-30 minutos

**Instrucciones:**

- Asegúrate de tener instalado para ejecutar el proyecto: Un IDE o editor de código.
- Copia todo el contenido del campo **Código Base** de este reto — incluyendo el texto de instrucciones que aparece al inicio.
- Abre un asistente de IA (Claude en claude.ai, ChatGPT o Gemini — se recomienda Claude), pega el contenido copiado en el chat y envíalo.
- El asistente analizará los archivos, corregirá errores y generará un archivo ZIP descargable. Descárgalo y extráelo en la carpeta donde quieras trabajar.
- Verifica que el proyecto arranca sin errores.

**Entregable:** El proyecto compila/arranca sin errores.

<details>
<summary>Pistas de conocimiento</summary>

- Copia el Código Base completo incluyendo el texto de instrucciones al inicio — esas instrucciones le indican al asistente exactamente qué hacer con los archivos.
- Si el asistente no genera el ZIP automáticamente al terminar el análisis, escríbele: "genera el ZIP ahora".
- Si el proyecto tiene errores al arrancar, comparte el mensaje de error con el mismo asistente para que lo corrija.

</details>

### Fase 1: Registro Inicial de Solicitudes

**Objetivo:** Implementar la funcionalidad para registrar las solicitudes de crédito en estado 'pendiente'.

**Tiempo estimado:** 1 hora

**Instrucciones:**

- El sistema debe recibir solicitudes de crédito desde el 'originador de créditos' y registrarlas en el estado 'pendiente'.
- Garantizar la idempotencia del registro de solicitudes por número de operación.

**Entregable:** Sistema que registra solicitudes de crédito en estado 'pendiente' con garantía de idempotencia.

<details>
<summary>Pistas de conocimiento</summary>

- Considera cómo manejar solicitudes duplicadas.
- Piensa en la estructura de datos adecuada para almacenar el estado de las solicitudes.

</details>

### Fase 2: Progresión de Estado en el Pipeline

**Objetivo:** Implementar la funcionalidad para progresar el estado de las solicitudes a través del pipeline de evaluación.

**Tiempo estimado:** 2 horas

**Instrucciones:**

- El sistema debe permitir que las solicitudes cambien de estado de 'pendiente' a 'en revisión', 'aprobado' o'rechazado' según las decisiones del'motor de decisiones de crédito'.
- Manejar los reintentos en caso de falla del'motor de decisiones de crédito' hasta un máximo de 3 intentos con un intervalo de 5 segundos.

**Entregable:** Sistema que permite la progresión del estado de las solicitudes a través del pipeline de evaluación con manejo de reintentos.

<details>
<summary>Pistas de conocimiento</summary>

- Considera cómo implementar la lógica de reintentos.
- Piensa en cómo manejar los estados intermedios de las solicitudes.

</details>

### Fase 3: Validación y Optimización

**Objetivo:** Validar el funcionamiento del sistema y optimizar el rendimiento.

**Tiempo estimado:** 1 hora

**Instrucciones:**

- Validar que el sistema maneja correctamente las solicitudes y progresa los estados adecuadamente.
- Optimizar el rendimiento para manejar un volumen de 1 500 solicitudes por segundo en hora pico.

**Entregable:** Sistema validado y optimizado para manejar el volumen de solicitudes especificado.

<details>
<summary>Pistas de conocimiento</summary>

- Considera cómo realizar pruebas de carga.
- Piensa en optimizaciones posibles para mejorar el rendimiento.

</details>

## Dimensiones Evaluadas

- **queEs**: ¿Qué es el ciclo de vida de estado en el pipeline de evaluación de solicitudes de crédito?
- **paraQueSirve**: ¿Para qué sirve garantizar la idempotencia del registro de solicitudes por número de operación?
- **comoSeUsa**: ¿Cómo se usa la lógica de reintentos en caso de falla del 'motor de decisiones de crédito'?
- **erroresComunes**: ¿Cuáles son los errores comunes al progresar el estado de las solicitudes a través del pipeline de evaluación?
- **queDecisionesImplica**: ¿Qué decisiones implica la optimización del rendimiento para manejar un volumen de 1 500 solicitudes por segundo en hora pico?

## Criterios de Evaluacion

- Implementar la funcionalidad para registrar las solicitudes de crédito en estado 'pendiente' con garantía de idempotencia.
- Implementar la funcionalidad para progresar el estado de las solicitudes a través del pipeline de evaluación con manejo de reintentos.
- Validar el funcionamiento del sistema y optimizar el rendimiento para manejar un volumen de 1 500 solicitudes por segundo en hora pico.

## Como trabajar con un asistente de IA

- **AGENTS.md** — instrucciones nativas del repo (Cursor, Codex, Copilot, Gemini, Claude Code). Abrí el proyecto y el agente las carga solo.
- **PROMPT_MEJORA.md** — el mismo prompt, para copiar y pegar en un chat (claude.ai, ChatGPT, etc.).

---

*Reto generado automaticamente por Challenge Generator - Pragma*
