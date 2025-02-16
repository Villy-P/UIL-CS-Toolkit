<script lang="ts">
    import markdownit from 'markdown-it';

    let { content }: {
        content: string;
    } = $props();

    function convertMarkdownToHTML(markdown: string) {
        const md = markdownit();
        return md.render(markdown);
    }
</script>

{#if content}
    {@html convertMarkdownToHTML(content)}
{:else}
    <p class="text-center">No content to display</p>
{/if}

<!-- Workaround to prevent unused class error -->
{#if false}
    <code class="code"></code>
{/if}