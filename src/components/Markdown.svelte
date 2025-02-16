<script lang="ts">
    let { content }: {
        content: string;
    } = $props();

    function convertMarkdownToHTML(markdown: string) {
        markdown = markdown.replace(/\*\*\*(.*?)\*\*\*/g, '<strong><em>$1</em></strong>');
        markdown = markdown.replace(/\*\*(.*?)\*\*/g, '<strong>$1</strong>');
        markdown = markdown.replace(/\*(.*?)\*/g, '<em>$1</em>');
        markdown = markdown.replace(/`(.*?)`/g, '<code class="bg-[#1c1c1c] px-1 rounded-lg py-0.5">$1</code>');
        return markdown;
    }
</script>

{#if content}
    <pre class="text-wrap font-sans">{@html convertMarkdownToHTML(content)}</pre>
{:else}
    <p class="text-center">No content to display</p>
{/if}

<!-- Workaround to prevent unused class error -->
{#if false}
    <code class="code"></code>
{/if}

<style>
    .code {
        background-color: #161616;
        padding: 0.2rem 0.4rem;
        border-radius: 0.3rem;
    }
</style>